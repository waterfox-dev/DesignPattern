# Le patron Singleton 

Le patron singleton a pour but de redonner toujours le même objet,
à chaque fois qu'on tente d'en créer un. 
Par exemple, si l'on veut construire une BDD, c'est très utile étant 
donné que celle-ci doit être la même pour toutes les connexions. 
Dans l'exemple même si plusieurs clients tente de créer une BDD, ils auront tous la même. 