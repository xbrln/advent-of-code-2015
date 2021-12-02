(ns advent-of-code.day02
  (:require
   [clojure.string :as str]))

(defn rectangle-area [l b h]
  (+ (* 2 l b) (* 2 b h) (* 2 h l)))

(defn smallest-side-area [l b h]
  (reduce min [(* l b) (* b h) (* h l)]))

(defn total-area [i]
  (let [l (Integer/parseInt (first i))
        b (Integer/parseInt (second i))
        h (Integer/parseInt (nth i 2))]
    (+ (rectangle-area l b h) (smallest-side-area l b h))))

(defn calculate-area [i]
  (reduce + (map total-area (map (fn [l] (str/split l #"x")) (str/split-lines i)))))

(defn ribbon-length [i]
  (let [l (Integer/parseInt (first i))
        b (Integer/parseInt (second i))
        h (Integer/parseInt (nth i 2))]
    (+ (* l b h) (* 2 (reduce + (filter (fn [x] (not= x (reduce max [l b h]))) [l b h]))))))

(defn calculate-ribbon [i]
  (reduce + (map ribbon-length (map (fn [l] (str/split l #"x")) (str/split-lines i)))))

(comment
  (calculate-ribbon "3x11x24
13x5x19"))
