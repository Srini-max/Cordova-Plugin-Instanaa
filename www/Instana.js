var Instana = {
  initconfig: function () {
    return new Promise(function (resolve, reject) {
      cordova.exec(resolve, reject, 'Instana', 'initconfig', [])
    })
  },
  setscreenname: function (screenname) {
    return new Promise(function (resolve, reject) {
      cordova.exec(resolve, reject, 'Instana', 'setscreenname', [screenname])
    })
  }
};

module.exports = Instana;