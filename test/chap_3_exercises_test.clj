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
