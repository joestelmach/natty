Searcher = Class.create({
  initialize : function() {
    this._textarea = $('search_input');
    this._textarea.focus();
    
  }
});

Event.observe(window, 'load', function() {
  new Searcher();
});
