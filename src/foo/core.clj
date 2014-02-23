(ns foo.core
  (:require [clj-http.client :as client]))

(defn -main
  [& args]
	(def resp (client/get "http://www.yelp.com"))
	(def headers (:headers resp))
	(def server (headers “server”))
	(println server)

)

