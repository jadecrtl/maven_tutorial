### Installation d'Apache maven

## taper cette commande dans le terminal :

sudo apt install maven

## vérifier son installation avec cette commande :

mvn -version

(Si le mvn -version renvoie une erreur disant JAVA_HOME should point to a JDK not a JRE il faut continuer dans tout les cas la procédure)

## Définir les variables d'environnement de la manière suivante :

# Se placer dans le répertoire /etc/profil.d/

# Créer un nouveau fichier maven.sh de cette manière :

sudo vim maven.sh 

# Une fois le fichier ouvert, collez la configuration suivante :

export JAVA_HOME=/usr/lib/jvm/default-java
export M2_HOME=/opt/maven
export MAVEN_HOME=/opt/maven
export PATH=${M2_HOME}/bin:${PATH}

# Une fois collé, sauvegardez et quittez le fichier 

# Rendez maintenant exécutable le script dactylographie :

sudo chmod+x maven.sh

# Pour finir il faut charger les variables d'environnement à l'aide de la commande suivante :

source maven.sh

# Vérifier une dernière fois l'installation avec :

mvn -version

# Normalement il n'y a pas de soucis Apache maven est bien installé
