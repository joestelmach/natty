$(document).ready(function() {
  var input = $('#text_input');

  var submit = function() {
    $('#loading').show();
    $('#structure').hide();
    $('#ast').hide();
    $('#structure_details').html('');
    $('#ast_details').html('');
    $('#result').hide();
    $.post("parse", {value : input.val()}, onResponse);
  };

  var onResponse = function(json) {
    $('#result').show();
    $('#loading').hide();
    $('#result').html(json.iso8601);
    $('#ast').show();
    $('#ast_details').html(json.ast);
    $('#structure').show();
    buildStructure(json.structure);
    input.focus();
    input.select();
  };

  buildStructure = function(structure) {
    var text = input.val();
    var indices = [];
    var maxEndIndex = 0;
    for(key in structure) {
      var item = structure[key];
      indices.push({start : item.start, end : item.end, name : key});
      if(item.end > maxEndIndex) maxEndIndex = item.end;
    }

    indices.sort(function(a,b) {
      return a.start === b.start ? 
        a.end < b.end ? 1 : -1 : 
        a.start < b.start ? -1 : 1;
    });

    var root = document.createElement("div");
    var parents = [root];
    var seekIndex = 0;
    var count = 0;
    for(var i=0; i<=maxEndIndex; i++) {
      for(var j=0; j<indices.length; j++) {
        var index = indices[j];
        if(index.start === i) {
          if(seekIndex < i) {
            var subText = text.substring(seekIndex, i);
            var imaginaryIndex = document.createElement('div');
            imaginaryIndex.className = 'index imaginary';
            imaginaryIndex.appendChild(document.createTextNode(subText));
            var p = parents[parents.length -1];
            p.appendChild(imaginaryIndex);
          }
          seekIndex = i;
          var div = document.createElement("div");
          div.className = "index";
          div.id = "index_" + count;
          count++;
          parents[parents.length -1].appendChild(div);
          parents.push(div);
        }

        if(index.end === i) {
          p = parents.pop();
          subText = text.substring(seekIndex, index.end);
          p.appendChild(subText.length > 0 ?
            document.createTextNode(subText) :
            document.createElement("br"));
          seekIndex = i;
        }
      }
    }

    // add the structure to the document and traverse again to add name nodes
    document.getElementById('structure_details').appendChild(root);
    for(i=0; i<indices.length; i++) {
      index = indices[i];
      div = document.getElementById("index_" + i);
      var nameDiv = document.createElement("div");
      nameDiv.className = "name";
      nameDiv.appendChild(document.createTextNode(index.name));
      div.appendChild(nameDiv);
    }
  };

  // submit on enter in text field
  input.keypress(function(e) {  
    if((e.which && e.which == 13) || (e.keyCode && e.keyCode == 13)) submit();  
  });

  // or when the submit button is pressed
	$('#submit').click(submit);

  // focus on the input by default
  input.focus();
  input.select();
});
