# Le patron Visiteur  

**Objectif** : Séparer les algorithmes des structures de données.

**Exemples** : Le retour de gribouille. Vous souhaitez mettre en place
une application de dessin qui permet d'exporter ses différentes formes
au format XML. Or, chaque forme ne nécessite pas le même traitement. 
La première est celle d'intégrer une méthode `export()` dans chaque 
forme, or c'est dénaturer la forme qui se retrouve à faire plus 
que ce qu'elle est sensé. 

**Solutions** : La solution peut se résumer à l'implémentation d'un 
visiteur. Chaque forme est une classe fille de l'interface `Shape`. 
Cette interface possède la méthode `accept` qui permet d'accepter une 
classe fille de l'interface `Visitor`. L'interface `Visitor` possède 
une méthode de visite pour chaque forme.