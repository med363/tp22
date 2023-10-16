# Travail à faire

## Créer et exécuter une application

1. Créez une application avec une mise en page (layout) qui contient un compteur `TextView`, un bouton pour incrémenter le compteur et un `EditText`. Voir la capture d'écran ci-dessous à titre d'exemple. Vous n'avez pas à dupliquer précisément la mise en page (layout).
2. Ajoutez un gestionnaire de clic pour le bouton qui incrémente le compteur.
3. Exécutez l'application et incrémentez le compteur. Entrez du texte dans `EditText`.
4. Faites pivoter l'appareil. Notez que le compteur est réinitialisé, mais pas `EditText`.
5. Implémentez `onSaveInstanceState()` pour enregistrer l'état actuel de l'application.
6. Mettez à jour `onCreate()` pour restaurer l'état de l'application.
7. Assurez-vous que lorsque vous faites pivoter le périphérique, l'état de l'application est préservé.

![screenshot](./images/screenshot.png)

## Répondre à ces questions

### **Question 1**

Si vous exécutez l'application de travail à faire avant d'implémenter `onSaveInstanceState()`, que se passe-t-il si vous faites pivoter le périphérique? Choisissez-en un:

- [ ] L'`EditText` ne contient plus le texte que vous avez entré, mais le compteur est conservé.
- [ ] Le compteur est réinitialisé à 0 et l'`EditText` ne contient plus le texte que vous avez entré.
- [ ] Le compteur est réinitialisé à 0, mais le contenu de l'`EditText` est préservé.
- [ ] Le compteur et le contenu de `EditText` sont préservés.

### **Question 2**

Quelles méthodes de cycle de vie d'activité sont appelées lorsqu'un changement de configuration de périphérique (tel qu'une rotation) se produit? Choisissez-en un:

- [ ] Android ferme immédiatement votre activité en appelant `onStop()`. Votre code doit redémarrer l'activité.
- [ ] Android arrête votre activité en appelant `onPause()`, `onStop()` et `onDestroy()`. Votre code doit redémarrer l'activité.
- [ ] Android arrête votre activité en appelant `onPause()`, `onStop()` et `onDestroy()`, puis redémarre l'opération en appelant `onCreate()`, `onStart()` et `onResume()`.
- [ ] Android appelle immédiatement `onResume()`.

### **Question 3**

Lorsque dans le cycle de vie de l'activité, `onSaveInstanceState()` est appelé? Choisissez-en un:

- [ ] `onSaveInstanceState()` est appelée avant la méthode `onStop()`.
- [ ] `onSaveInstanceState()` est appelée avant la méthode `onResume()`.
- [ ] `onSaveInstanceState()` est appelée avant la méthode `onCreate()`.
- [ ] `onSaveInstanceState()` est appelée avant la méthode `onDestroy()`.

### **Question 4**

Quelles méthodes de cycle de vie d'Activité sont les meilleures à utiliser pour enregistrer des données avant la fin ou la destruction de l'activité? Choisissez-en un:

- [ ] `onPause()` ou `onStop()`
- [ ] `onResume()` ou `onCreate()`
- [ ] `onDestroy()`
- [ ] `onStart()` ou `onRestart()`

## Soumettez votre application pour la notation

Vérifiez que l'application dispose des éléments suivants:

* Il affiche un compteur, un bouton pour incrémenter ce compteur et un `EditText`.
* Un clic sur le bouton incrémente le compteur de 1.
* Lors de la rotation du périphérique, les états counter et `EditText` sont conservés.
* L'implémentation de `MainActivity.java` utilise la méthode `onSaveInstanceState()` pour stocker la valeur du compteur.
* L'implémentation de `onCreate()` teste l'existence du `bundle` `outState`. Si cet `Bundle` existe, la valeur du compteur est restaurée et enregistrée dans `TextView`.
