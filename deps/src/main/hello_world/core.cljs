(ns hello-world.core
  (:require [reagent.dom :as rdom]))

(defn page []
  [:div
   [:h1 "Hello world"]])

(defn init []
  (rdom/render [#'page] (.getElementById js/document "root")))

(defn ^:dev/after-load  refresh! []
  (rdom/force-update-all))