(ns advent-of-code.day01-test
  (:require [clojure.test :refer :all]
            [advent-of-code.day01 :refer :all]))

(deftest what-floor-test
  (testing "what-floor method"
    (is (= 2 (what-floor "(((())")))
    (is (= 1 (what-floor "(((()))")))
    (is (= 0 (what-floor "(((())))")))
    (is (= 3 (what-floor "(((()")))
    (is (= -2 (what-floor "(((())))))")))))

(deftest basement?-test
  (testing "basement? method"
    (is (= 1 (basement? ")")))
    (is (= 1 (basement? "))))")))
    (is (= 3 (basement? "())")))))
