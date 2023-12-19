# Le patron fabrique 
---
Nous sommes en pleine guerre froide et vous êtes fabriquant de fusée. 
Vous recevez des appels de deux marques : 
- Saturn (NASA)
- Soyouz (URSS)
Les deux veulent faire construire leurs modèles phares qui (étrangement)
se ressemble. La Saturn5 et la Soyouz2.
Chaque marque est une extension de `RocketBrand` qui possède la méthode 
`build` pouvant s'apparenter à la manière dont on construit une fusée selon un plan.
Et cette fonction retourne une instance de `Rocket`.