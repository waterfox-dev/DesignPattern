# Le patron Observateur 
**Objectif** : Construire une dépendance entre un sujet et ses
observateurs de façon à ce que toute modification du sujet soit
notifiée aux observateurs et qu’ils puissent mettre à jour leur état.

**Exemple** : Dans le cadre d'un éditeur de texte sécurisé. À chaque 
changement, celui-ci averti par mail les utilisateurs du document. De plus 
chaque changement est enregistré dans un fichier de log. 

**Solution** : La solution propre au patron observateur repose sur la création 
d'un `EventManager` qui souscrit ou non des évènements à des listeners. P
de fait, il possède les méthodes `subscribe(eventType, listener)` et `unsubscribe`
qui fonctionne de la même manière. Chaque listener est un fils de l'interface 
`EventListener` qui implémente la méthode `update` relative à la mise
à jour du document. Par conséquent, nous aurons les classes filles : 
- `EmailAlertListnener`
- `LoggingListener`
