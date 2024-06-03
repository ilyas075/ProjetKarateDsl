function fn() {

  var config = { // base config JSON

    urlServeur : 'https://jsonplaceholder.typicode.com/posts'

  };

  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  karate.configure('ssl', { trustAll: true });
  return config;
}