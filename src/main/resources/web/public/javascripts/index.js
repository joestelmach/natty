$(document).ready(function() {
  // do stuff when DOM is ready
	$('#submit').click(function(e) {
    var input = $('#text_input');
    $.post("parse", {value : input.val()}, function(json) {
      console.log(json);
      var text = json.structure.date_time.text;
      input.val('');
      $('#result').html(json.iso8601);
      $('#structure').html(text);
    });
	});
});
