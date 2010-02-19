Parser = Class.create({
  initialize : function() {
    this._input = $('text_input');
    this._loadingIndicator = $('loading');
    this._date = $('date');
    this._summary = $('summary');
    this._error = $('error');
    this._structureDetails = $('structure_details');
    this._astDetails = $('ast_details');

    // submit on enter in text field
    this._input.observe('keypress', function(e) {  
      if((e.which && e.which == 13) || (e.keyCode && e.keyCode == 13)) this._submit();
    }.bind(this));

    // or when the submit button is pressed
    $('submit').observe('click', this._submit.bind(this));

    // focus on the input by default
    this._input.focus();
    this._input.select();
  },

  /**
  *
  */
  _submit : function() {
    this._loadingIndicator.show();
    this._summary.hide();
    this._date.hide();
    this._error.hide();
    new Ajax.Request('parse', {
      method : 'post', 
      parameters : {value : this._input.value}, 
      onSuccess : this._onSuccess.bind(this),
      onFailure : this._onFailure.bind(this),
      onException : this._onFailure.bind(this)
    });
  },

  /**
  *
  */
  _onSuccess : function(transport) {
    var json = transport.responseJSON;
    this._loadingIndicator.hide();
    if(json.errors) {
      this._error.show();
    }
    else {
      this._summary.show();
      this._date.update(json.iso8601).show();
      this._structureDetails.update(new ParseTree().build(this._input.value, json.structure)).show();
      this._astDetails.update(new AbstractSyntaxTree().build(json.ast));
    }
  },

  /**
  *
  */
  _onFailure : function(request, exception) {
    console.log(exception);
  }
});

Event.observe(window, 'load', function() {
  new Parser();
});
