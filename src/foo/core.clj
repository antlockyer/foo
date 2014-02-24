(ns foo.core
  (:require [clj-http.client :as client]))

(defn -main
  [& args]
  (def url (first args))
  (println url)
  (def resp (client/get url))
  (def headers (:headers resp))
  (def server (headers "server"))
  (println server))

