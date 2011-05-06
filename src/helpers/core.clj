(ns ^{:doc "Helper functions which are useful for almost every Clojure project."}
  helpers.core)

(defmacro symbol-map
  "Takes any number of (quoted) symbols and builds a hash map with key value pairs
   where the key is the keyword of the symbol name and the value the symbol's value
   in the lexical scope where symbol map is invoked. An example:

   >(let [a \"hello\" b \"world\"] (symbol-map 'a 'b))
   {:a \"hello\", :b \"world\"}"
  [& symbols]
  (into {} (map (fn [s] (let [sym s] `[(keyword ~sym) ~(second sym)])) (seq symbols))))
