(ns daycare-front.core
  (:require  [reagent.core :as r]))

(defn root-component []
  [:div "Hello!"])

(defn mount-root [setting]
  (r/render [root-component]
                  (.getElementById js/document "app")))

(defn init! [setting]
  (mount-root setting))
