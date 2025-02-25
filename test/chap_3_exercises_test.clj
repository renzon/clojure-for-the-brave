(ns chap-3-exercises-test
  (:require [clojure.test :refer :all]))

(deftest test_datas_structures_functions
  (testing "Testing basic Clojure data structures funcitions"
    (is (= "Hello World" (str "Hello" " " "World")))
    (is (= [1 2 3] (vector 1 2 3)))
    (is (= '(1 2 3) (list 1 2 3)))
    (is (= {:name "Renzo" :lastname "Nuccitelli"}
           (hash-map :name "Renzo" :lastname "Nuccitelli")))
    (is (= #{:name :lastname} (hash-set :name :lastname :name :lastname)))))


(defn add_hundred [x] (+ x 100))

(deftest test_add_hundred
  (testing "Ex 2 of chapter 3"
    (is (= 100 (add_hundred 0)))
    (is (= 110 (add_hundred 10)))))
