(ns ^{:doc "Helper functions which are useful for clojure.core stuff."}
  helpers.core)

(defmacro symbol-map
  "Takes any number of symbols and builds a hash map with key value pairs
   where the key is a keyword of the symbol's name and the value is the
   symbol's value in the lexical scope where symbol-map is invoked.

   An example:

   >(let [a \"hello\" b \"world\"] (symbol-map a b))
   {:a \"hello\", :b \"world\"}"
  [& symbols]
  (into {} (map (fn [s] `[(keyword (quote ~s)) ~s]) symbols)))

(defn nested-access
  "Abstracts the access path to a nested value in a map, so that the access
   path doesn't not have to be repeated in the code."
  [path]
  (fn [map & [value]]
    (if value
      (assoc-in map path value)
      (get-in map path))))
