Searcher = Class.create({
  initialize : function() {
    this._textarea = $('search_input');
    this._results = $('results');
    this._error = $('error');
    this._loadingIndicator = $('loading');
    this._textarea.focus();
    $('submit').observe('click', this._submit.bind(this));
  },

  /**
  *
  */
  _submit : function() {
    this._loadingIndicator.show();
    this._results.hide();
    $('annotated_results').update('');
    $('result_list').update('');
    this._error.hide();
    new Ajax.Request('search', {
      method : 'post', 
      parameters : {value : this._textarea.value}, 
      onSuccess : this._onSuccess.bind(this),
      onFailure : this._onFailure.bind(this),
      onException : this._onFailure.bind(this)
    });
  },

  _onSuccess : function(transport) {
    var json = transport.responseJSON;
    this._loadingIndicator.hide();
    if(json.errors) {
      this._error.update(json.errors);
      this._error.show();
    }
    else {
      this._insertList(json);
      this._insertAnnotations(json);
      this._results.show();
    }
  },

  _onFailure : function(request, exception) {
    console.log(exception);
  },

  _insertList : function(json) {
    $A(json.locations).each(function(loc) {
      var dateList = loc.date_times.collect(function(dt) { return dt.localtime; });
      var li = new Element("li");
      li.insert("<span class='highlight'>" + loc.text + "</span>");
      var ul = new Element('ul');
      dateList.each(function(d) { 
        ul.insert(new Element('li').insert(d));
      });
      li.insert(ul);
      $('result_list').insert(li);
    });
  },

  _insertAnnotations : function(json) {
    var text = this._textarea.value;
    var lines = text.split('\n');
    var html = "";

    lines.each(function(line, i) {
      var locations = $A(json.locations).select(function(loc) { return loc.line === i + 1; });
      if(locations.length > 0) {
        html += line.substring(0, locations.first().start);
        locations.each(function(loc, i) {
          html += "<span class='highlight'>" + line.substring(loc.start, loc.end) + "</span>";
          var nextLoc = locations[i + 1];
          if(nextLoc) html += line.substring(loc.end, nextLoc.start); 
        });
        html += line.substring(locations.last().end, line.length);
      }

      else { html += line; }

      html += '<br/>';
    });

    $('annotated_results').update(html);
  }
});

Event.observe(window, 'load', function() {
  new Searcher();
});
