import Vue from 'vue'
import VueI18n from 'vue-i18n'  

import zh from './zh/index.js'

Vue.use(VueI18n) 

const i18n = new VueI18n({  
  locale: 'zh',  
  messages: {  
    zh
  }  
})
Vue.prototype._i18n = i18n  

export default i18n;