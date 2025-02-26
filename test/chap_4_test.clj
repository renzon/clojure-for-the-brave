(ns chap-4-test
  (:require [clojure.test :refer :all]
            [chap-4 :refer :all]))



(deftest mymap-test
  (testing "mapping implementation using reduce"
    (is (= (map inc [1, 2 ,3]) (my-map inc [1, 2 ,3])))))
