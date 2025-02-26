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


(defn dec_maker [dec_param]
  (defn dec_f [x]
    (- x dec_param))
  )

(deftest test_dec_maker
  (testing "Ex 3 of chapter 3"
    (is (= -100 ((dec_maker 100) 0)))
    (is (= 18 ((dec_maker 2) 20)))))


(defn mapset [f coll]
  (into #{} (map f coll)))

(deftest test_mapset
  (testing "Ex 4 of chapter 3"
    (is (= #{2 3} (mapset inc [1 1 2 2])))
    (is (= #{2 3 5} (mapset inc [1 1 2 2 4 4 4 4])))))
