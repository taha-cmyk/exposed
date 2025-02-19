# Ruby Syntax Highlighting Patterns

## Overview
The `getRubySyntaxPatterns` function returns a list of syntax patterns for the Ruby programming language. These patterns can be used to highlight different elements of Ruby code, such as keywords, strings, comments, and more.

## Function Description
### getRubySyntaxPatterns

*   Returns a list of syntax patterns for the Ruby programming language.
*   Takes a `theme` parameter of type `SyntaxHighlightingTheme`, which provides styles for different syntax elements.

### Parameters

*   `theme`: A `SyntaxHighlightingTheme` object that provides styles for different syntax elements.

### Return Value

*   A list of `SyntaxPattern` objects, each representing a syntax pattern for Ruby.

## Syntax Patterns

The following syntax patterns are included:

### Keywords

*   Pattern: `\\b(alias|and|begin|break|case|class|def|defined\\?|do|else|elsif|end|ensure|false|for|if|in|module|next|nil|not|or|redo|rescue|retry|return|self|super|then|true|undef|unless|until|when|while|yield)\\b`
*   Style: `theme.getKeywordStyle()`

### Built-in Functions

*   Pattern: `\\b(puts|gets|require|include|extend|each|map|select|reject|reduce|inject|find|detect|all\\?|any\\?|none\\?|one\\?|sort|sort_by|reverse|length|size|count|first|last|min|max|sum|uniq|join|split|gsub|sub|chomp|strip|lstrip|rstrip|to_s|to_i|to_f|to_a|to_h|to_sym|nil\\?|empty\\?|include\\?|key\\?|value\\?|merge|fetch|delete|clear|push|pop|shift|unshift|concat|flatten|compact|zip|cycle|take|drop|take_while|drop_while|group_by|partition|slice|sample|shuffle|rand|exit|abort|raise|catch|throw|lambda|proc|call|eval|instance_eval|class_eval|define_method|attr_accessor|attr_reader|attr_writer|private|protected|public)\\b`
*   Style: `theme.getLanguageSpecificStyle("ruby_builtin_function")`

### Strings

*   Pattern: `(\"\"\".*?\"\"\"|\"[^\"]*\")`
*   Style: `theme.getStringStyle()`

### Single-Quoted Strings

*   Pattern: `\'([^\'\\\\]|\\\\.)*\'`
*   Style: `theme.getStringStyle()`

### Multi-line Strings

*   Pattern: `\"\"\"(.*?)\"\"\"`
*   Style: `theme.getStringStyle()`

### Symbols

*   Pattern: `(:[\\w_]+)`
*   Style: `theme.getLanguageSpecificStyle("ruby_symbol")`

### Numbers

*   Pattern: `\\b([0-9]+(\\.[0-9]+)?|0x[0-9a-fA-F]+)\\b`
*   Style: `theme.getNumbersStyle()`

### Single-line Comments

*   Pattern: `#.*`
*   Style: `theme.getCommentStyle()`

### Class Definitions

*   Pattern: `\\bclass\\s+(\\w+)`
*   Style: `theme.getLanguageSpecificStyle("ruby_class")`

### Method Declarations

*   Pattern: `\\bdef\\s+(\\w+)\\s*\\(`
*   Style: `theme.getLanguageSpecificStyle("ruby_method")`

### Variables

*   Pattern: `\\b(\\w+)\\s*=`
*   Style: `theme.getLanguageSpecificStyle("ruby_variable")`

### Constants

*   Pattern: `\\b[A-Z][A-Z0-9_]+\\b`
*   Style: `theme.getLanguageSpecificStyle("ruby_constant")`

### Operators

*   Pattern: `[+\\-*/=%&|^~<>!?]+`
*   Style: `theme.getLanguageSpecificStyle("ruby_operator")`

### Brackets, Parentheses, and Braces

*   Pattern: `[\\[\\]]`
*   Style: `theme.getLanguageSpecificStyle("ruby_bracket")`
*   Pattern: `[()]`
*   Style: `theme.getLanguageSpecificStyle("ruby_parenthesis")`
*   Pattern: `[{}]`
*   Style: `theme.getLanguageSpecificStyle("ruby_brace")`

### Method Parameters

*   Pattern: `\\((\\s*\\w+\\s*:)`
*   Style: `theme.getLanguageSpecificStyle("ruby_parameter")