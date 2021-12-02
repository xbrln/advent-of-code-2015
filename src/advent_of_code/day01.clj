(ns advent-of-code.day01)

(defn what-floor [i]
  (let [f (frequencies i)
        up (get f \()
        down (get f \))]
    (- up down)))

(defn basement? [i]
  (loop [p 0
         f 0
         i i]
    (let [new-f (if (= "(" (str (first i)))
                  (inc f)
                  (dec f))]
      (if (neg? new-f)
        (inc p)
        (recur (inc p) new-f (rest i))))))

(comment
  (what-floor "(()))))")
  (basement? "(()))))"))
