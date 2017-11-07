import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const state = {
  status: null,
  content: null,
  msg: null
}

const mutations = {

  setStatus (state, payload) {
    state.status = payload.status
  },

  setContent (state, payload) {
    state.content = payload.content
  },

  setMsg (state, payload) {
    state.msg = payload.msg
  }
}

export default new Vuex.Store({
  state,
  mutations
})
