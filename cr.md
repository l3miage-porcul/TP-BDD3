1) Avez-vous remarqué quelque-chose avec les fonctions par interpolation ?
  Elles ne permettent pas de faire tout ce qu'on veut, si notre but est très spécifique il faut créer un requête jpql

2) A votre avis, quelle est la manière la plus efficace pour récupérer et mettre en relation plusieurs éléments entre eux ?
  Il faut utiliser des mappedBy

3) Ici, Les components renvoient directement les entités, pensez-vous que cela soit une bonne chose ? Sinon, quelle serait la bonne méthode ?
  Il vaut mieux passer par une couche DTO d'abord

4) Si je supprime un artiste, que se passe-t-il ?
  Supression en cascade des sons et albums

5) Si je récupère une playlist, est-ce que toute l'entité est chargée ?
   Il semblerait que oui
  

