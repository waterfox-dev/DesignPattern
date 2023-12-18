# Le patron Commande 
**Objectif** : Isoler une action dans le but d’en simplifier ou d’en
différer l’usage.

**Exemple** : Dans le cadre d'une maison connectée, nous 
souhaitons programmer une télécommande qui effectuerait diverses actions 
dont l'allumage de la lumière. 

**Solution** : Chaque commande hérite d'une interface `Command`
qui possède la méthode `execute()`. Nous créerons une classe 
`TurnOnLight` qui implémentera `Command` et nous créerons une 
classe `Light` qui recevra la commande et l'exécutera. Pour finir, nous
créerons une classe `Remote` qui appellera la commande. Nous ferons de 
même pour éteindre la lumière.

**Détail** : Le patron commande possède toujours 4 éléments clés : 
- Une interface de commande 
- Une classe concrète ou plus de commande 
- Une classe réceptrice (ici la lumière)
- Une classe invocatrice (ici la télécommande)