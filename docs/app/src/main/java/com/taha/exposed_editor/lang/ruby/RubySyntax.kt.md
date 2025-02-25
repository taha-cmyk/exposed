# Ruby Syntax Patterns
====================================

## Overview
------------

This module provides a list of syntax patterns for the Ruby programming language. These patterns are used for syntax highlighting and can be customized using a `SyntaxHighlightingTheme`.

## API Reference
-----------------

### `getRubySyntaxPatterns(theme: SyntaxHighlightingTheme)`

**Description**: Returns a list of syntax patterns for the Ruby programming language.

**Parameters**:
- `theme` (SyntaxHighlightingTheme): The theme to use for syntax highlighting.

**Returns**: A list of `SyntaxPattern` objects.

**Throws**: None

**Example**:
```kotlin
val theme = SyntaxHighlightingTheme()
val patterns = getRubySyntaxPatterns(theme)
```

## Syntax Patterns
------------------

The following syntax patterns are included:

### Keywords

* `alias`
* `and`
* `begin`
* `break`
* `case`
* `class`
* `def`
* `defined?`
* `do`
* `else`
* `elsif`
* `end`
* `ensure`
* `false`
* `for`
* `if`
* `in`
* `module`
* `next`
* `nil`
* `not`
* `or`
* `redo`
* `rescue`
* `retry`
* `return`
* `self`
* `super`
* `then`
* `true`
* `undef`
* `unless`
* `until`
* `when`
* `while`
* `yield`

### Built-in Functions

* `puts`
* `gets`
* `require`
* `include`
* `extend`
* `each`
* `map`
* `select`
* `reject`
* `reduce`
* `inject`
* `find`
* `detect`
* `all?`
* `any?`
* `none?`
* `one?`
* `sort`
* `sort_by`
* `reverse`
* `length`
* `size`
* `count`
* `first`
* `last`
* `min`
* `max`
* `sum`
* `uniq`
* `join`
* `split`
* `gsub`
* `sub`
* `chomp`
* `strip`
* `lstrip`
* `rstrip`
* `to_s`
* `to_i`
* `to_f`
* `to_a`
* `to_h`
* `to_sym`
* `nil?`
* `empty?`
* `include?`
* `key?`
* `value?`
* `merge`
* `fetch`
* `delete`
* `clear`
* `push`
* `pop`
* `shift`
* `unshift`
* `concat`
* `flatten`
* `compact`
* `zip`
* `cycle`
* `take`
* `drop`
* `take_while`
* `drop_while`
* `group_by`
* `partition`
* `slice`
* `sample`
* `shuffle`
* `rand`
* `exit`
* `abort`
* `raise`
* `catch`
* `throw`
* `lambda`
* `proc`
* `call`
* `eval`
* `instance_eval`
* `class_eval`
* `define_method`
* `attr_accessor`
* `attr_reader`
* `attr_writer`
* `private`
* `protected`
* `public`

### Strings

* Double-quoted strings: `"string"`
* Single-quoted strings: `'string'`
* Multi-line strings: `"""string"""`

### Symbols

* `:symbol`

### Numbers

* Integers: `123`
* Floats: `123.45`
* Hexadecimal numbers: `0x123`

### Comments

* Single-line comments: `# comment`

### Class Definitions

* `class MyClass`

### Method Declarations

* `def my_method`

### Variables

* Assignments: `x = 5`

### Constants

* Uppercase constants: `MY_CONSTANT`

### Operators

* Arithmetic operators: `+`, `-`, `*`, `/`, `%`, `**`
* Comparison operators: `==`, `!=`, `===`, `<=>`, `>`, `<`, `>=` , `<=`
* Logical operators: `&&`, `||`, `!`
* Assignment operators: `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `**=`

### Brackets, Parentheses, and Braces

* Brackets: `[`, `]`
* Parentheses: `(`, `)`
* Braces: `{`, `}`

### Method Parameters

* Method parameters: `def my_method(x:)`

### Local Variables

* Assignments: `x = 5`

### Global Variables

* Global variables: `$global_variable`

### Instance Variables

* Instance variables: `@instance_variable`

### Class Variables

* Class variables: `@@class_variable`