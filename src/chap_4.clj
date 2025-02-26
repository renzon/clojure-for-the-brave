(ns chap-4)

(defn my-map
  [f coll]
  (reduce (fn [vec, value]
            (conj vec (f value)))
          []
          coll)
  )

