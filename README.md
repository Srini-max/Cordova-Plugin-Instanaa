# Cordova-Plugin-Instana

Cordova plugin for Instana Agent 

   

## Installation
    cordova plugin add Cordova-Plugin-Instana

## Quick Example

Call below function wherever required

```javascript

  Instana.initconfig().then(function() {
      alert("init configuartion- ");
    }).catch(function(err) {
      alert("error in init configuartion:- "+err);
    });
 Instana.setscreenname('AED').then(function() {
      alert("screen name captured- ");
    }).catch(function(err) {
      alert("error in screen name capture:- "+err);
    });
```

#### Request Failed

Make sure you check the APK on a real device and not on an emulator.


## License

MIT
