(ns foo.core
  (:require [clj-http.client :as client]))

(defn -main
  [& args]
  (let [url (first args)
	resp (client/get url)
	server (get-in resp [:headers "server"])]
  (println url)
  (println server)))
