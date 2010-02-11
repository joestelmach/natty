$(document).ready(function() {
  var input = $('#text_input');

  var submit = function() {
    $('#structure').hide();
    $('#result').hide();
    $.post("parse", {value : input.val()}, function(json) {
      var text = input.val();
      input.val('');
      $('#result_details').html(json.iso8601);
      $('#structure_details').html(text);
      $('#structure').show();
      $('#result').show();
    });
  };

  // submit on enter in text field
  input.keypress(function(e) {  
    if((e.which && e.which == 13) || (e.keyCode && e.keyCode == 13)) {
      submit();
    }  
  });
  input.focus();

  // or when the submit button is pressed
	$('#submit').click(submit);
});
