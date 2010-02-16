window.AbstractSyntaxTree = Class.create({
  initialize : function() {},

  build : function(inputString) {
    this._token = '';
    this._level = 0;
    this._wrapper = new Element('div');
    this._div = new Element('div').addClassName('token root');
    for(var i=0; i<inputString.length; i++) {
      var c = inputString.charAt(i);
      if(c === '(') {
        this._level++;
        this._div.addClassName('root');
        this._isRoot = true;
      }

      else if(c === ')') {
        this._level--;
        this._isRoot = false;
      }

      else if(c === ' ') {
        this._consumeToken();
        this._isRoot = false;
      }

      else {
        this._token += c;  
      }
    }

    if(this._token.length > 0) this._consumeToken();
    return this._wrapper;
  },

  _consumeToken : function() {
    this._div.insert(this._token);
    this._wrapper.insert(this._div); 

    this._div = new Element('div').addClassName('token');
    this._token = '';
    this._tab();
  },

  _tab : function() {
    var spacingString = '';
    for(var i=0; i<this._level; i++) {
      spacingString += '----';
    }

    this._div.insert(new Element('span').addClassName('spacing').update(spacingString));
  }
});
