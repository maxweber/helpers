(ns helpers.uuid
  (:import java.util.UUID))

(defn uuid
  "Returns a new UUID as string."
  []
  (.toString (java.util.UUID/randomUUID)))

(def uuid-pattern
     #"[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}")
