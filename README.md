## What

Natty is a natural language date parser written in Java.  Given a date
expression, natty will apply standard language recognition and translation
techniques to produce a list of corresponding dates with optional parse and
syntax information.

## History

Originally written by Joel Stelmach at https://github.com/joestelmach/natty and developed between 2010 and 2017. Abandoned since then.

## Idea behind the fork

Started with [a thread in the original project](https://github.com/joestelmach/natty/issues/274). The aim is to try providing maintenance for the library.

Plan / Priorities (as of January 2022):

1. ~~Release version `1.0.0` with (possibly) the same code as the fork root, but under new name, consider renaming packages and artifacts to use `natty-parser` as the moniker, etc.~~
DONE
2. Fix the tests (some are failing?).
3. Set up basic technicalities of the fork - Maven release process, CI (Continuous Integration), etc. 
4. Start accepting contributions (PRs), encourage the community to solve [issues reported in the original repo](https://github.com/joestelmach/natty/issues)
5. Consider switching to Gradle (as this is a build tool which is modern and I am familiar with)
6. Decide on the overall vision of the project - at this point it's hard to tell, but I think a conscious decision on what is gonna be supported would be
great - i.e. focus on i18n, customization, stability, or what?

## Contibutions

Are more then welcome. Feel free to reach out (e.g. by creating an issue in this repo) to offer your support and ideas. I am happy to include more
maintainers.

I see this project potentially being welcoming to many, incl. quite junior and inexperienced developers, who would like to learn and contribute.
