# Cordova-Plugin-Instana

Cordova plugin for Instana Agent 

   

## Installation
    cordova plugin add Cordova-Plugin-Instana

## Quick Example

Call below function wherever required

```javascript

 Instana.setup('', function(success){
   console.log('success') 
}, function(err){
    console.error(err);
});

```

#### Request Failed

Make sure you check the APK on a real device and not on an emulator.


## License

MIT
