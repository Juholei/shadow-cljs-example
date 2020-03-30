(ns hello-world.core-test
  (:require [cljs.test :refer-macros [is deftest testing]]))

(deftest test-test
  (testing "Testing this thing"
    (is (= 1 2))))
