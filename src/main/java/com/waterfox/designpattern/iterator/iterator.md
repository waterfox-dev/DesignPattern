# Le patron Itérateur 
**Objectif** : Parcourir les éléménts d'une collection s'occuper de
l'ordre.

**Exemple** : Dans le cadre d'une base de données pour 
une association, nous souhaitons stocker une liste de donateur.ices. 
Le problème est le suivant quelle structure de donnée choisir et 
comment concevoir un système qui est flexible aux changements. 

**Solution** : Implémenter une classe imbriquée implémentant la 
classe abstraite `Iterator` de Java de sorte qu'à chaque ajout d'un
élève c'est la  classe interne qui prend le relai. 