# Le patron Stratégie 

**Objectif** : Le patron stratégie modifie le comportement 
d'un object sans modifier son intéraction avec le client.

**Exemple** : Nous disposons d'une carte en ligne qui 
permet d'afficher un itinéraire d'un point A à un 
point B en fonction du moyen de transport choisi : 
- Le train 
- La voiture 
- Le vélo

Bien que la fonction de routage opère sur la même 
carte, elle fonctionne différemment en fonction du moyen
de transport. 

**Solution** : La solution est donc la suivante :
- Créer une classe `Map` qui possède une stratégie de 
traçage d'itinéraire. 
- Créer une interface `ItineraryStrategy` qui possède
la méthode `route(A, B)` 
- Créer des classes concrètes héritant de la classe 
`ItineraryStrategy` en fonction du moyen de transport
- Faire en sorte que `Map` appelle à chaque fois la 
méthode `route` d'un fils de `ItineraryStrategy`.
