(ns juxt-card.core
    (:require [reagent.core :as reagent :refer [atom]]))

(enable-console-print!)

(println "This text is printed from src/juxt-card/core.cljs. Go ahead and edit it and see reloading in action.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(defn hello-world []
  [:div.page
   [:div
    [:div.family_photo]
    [:div.family.sam]
    [:div.family.marla]
    [:div.family.parker]
    [:div.greeting]
    [:div.text.instructions [:b "To Juxt!"] [:p "Merry Christmas!"] [:p "From Connie!"]]

    [:div.b.hidden.about_sam "Hello I'm an elf! I love Minecraft!!"]
    [:div.b.hidden.about_marla "Hello I'm Rudolph! I love Clojure!!"]
    [:div.b.hidden.about_parker "Hello I'm Santa! I love ClojureScript!!!!!"]]])



(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
