1. Git wykona fast forward, jak oryginalna wersja, z której robiliśmy branch, się nie zmienia, czyli nie dodaliśmy nowych commitów, ale jeśli coś zmienimy w oryginalnej wersji, to powstaje Merge commit.

2. Merge zachowuje oryginalną historię commitów, przez co na grafie widać wybrzuszenia, a Rebase przepisuje tę historię tak, żeby była w jednej linii z gałęzi bocznej na szczyt gałęzi głównej

3. Konflikt w moim repo rozwiązałem tak, że zostawiłem obie opcje, ponieważ ze sobą nie kolidowały.