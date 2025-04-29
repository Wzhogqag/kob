<template>
    <ContentField>
        我的bot
    </ContentField>
</template>

<script>
import ContentField from '../../../components/ContentField.vue'
import $ from "jquery"
import { useStore } from 'vuex'

export default{
  components:{
    ContentField
  },
  setup() {
    const store = useStore();
    $.ajax({
      url: "http://localhost:3000/user/bot/add/",
      type: "post",
      data: {
        title: "Bot的标题",
        description: "Bot的描述",
        content: "Bot的代码",
      },
      headers: {
        Authorization: "Bearer " + store.state.user.token,
      },
      success(resp) {
        console.log(resp);
      },
      error() {
        console.log("当前 token：", store.state.user.token);
      },
    });
  }

}

</script>


<style scoped>

</style>