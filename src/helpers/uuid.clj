(ns helpers.uuid
  (:import java.util.UUID))

(defn uuid
  "Returns a new UUID as string."
  []
  (.toString (java.util.UUID/randomUUID)))
