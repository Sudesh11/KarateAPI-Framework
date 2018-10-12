function() {
  var config = { // to set URL as default
    baseURL: 'http://dummy.restapiexample.com/api/v1'
  };
  
  //if servers don't respond within 5 seconds
  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return config;
}