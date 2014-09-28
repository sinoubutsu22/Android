Android
=======
We use this library on GitHub when rendering your README or any other
rich text file. The generated HTML is then run through filters in the [html-pipeline](https://github.com/jch/html-pipeline) to perform things like [sanitization](#html-sanitization) and [syntax highlighting](https://github.com/jch/html-pipeline/blob/master/lib/html/pipeline/syntax_highlight_filter.rb).



Usage
-----

    require 'github/markup'
    GitHub::Markup.render('README.markdown', "* One\n* Two")
