(ns t20-collections-vmaps)

(hash-map :one 1 :two 2)

(def my-map {:one 1 :two 2 :three 3})

(type my-map )

;;keys
(keys my-map)
;;values
(vals my-map)
;;keyword

;;zipmap

; returns map;
;; common map functions
;check for empty? and nil?
(nil? my-map)
(nil? {})

(empty? my-map)
(empty? {})
(map? {})


;iterate
(doseq [x my-map]
  (println "iterate with doseq" x))

(map println my-map)
(map #(println "iterate with map " %) my-map)
(map (fn[[k v]]
       (println "key "k " value "v)
       ) my-map)

(loop [x my-map]
  (when (seq x)
    (println "iterate with loop recur " (first x))
    (recur (rest x))))

;;iterate by key
(map (fn[map-key]
       (println "key is " map-key " value is " (get my-map map-key))
       ) (keys my-map))


;count key value pairs
(count my-map)

;first element
(first my-map)

;second element;
(second my-map)

;; by keys
(my-map :one)
(:one my-map)
(get my-map :one)
(get my-map :x "not found")

;submap
(next my-map);; looks for next elements and if not found returns nil
(rest my-map);; apply seq on rest of the elements; never returns nil and if no elements found returns seq also lazy

;; apped a to map
(conj my-map {:four 4}) ;; conj on list always appends last
(merge my-map {:four 4})
(assoc my-map :four 4)
(concat my-map {:four 4}) ;; returns a seq of vector;; each vector can be changes as map using into
(into {} (concat my-map {:four 4}))

;remove elements
(dissoc my-map :three)
