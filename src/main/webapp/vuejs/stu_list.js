new Vue({
    el:"#app",
    data:{
        stulist:[],
        stu:{}
    },
    methods:{
        /*用户全查*/
        getStuList:function () {
            var _this = this;
            axios.get('findAll.do').then(function (obj) {
                _this.stulist = obj.data;
            });
        },
        findOne:function(sid){
            var _this = this;
            axios.get('findOne.do?sid='+sid).then(function (response) {
                alert(11);
                _this.stu = response.data;
                _this.$refs.div3.style.display="block";
            });
        },

        /*点击添加下面出来添加页面*/
        saveUser:function(){
            alert("11111")
            this.$refs.div4.style.display="block";
        },

        addUser:function(){
            var _this = this;
            axios.post('addUser.do',_this.stu).then(function (response) {
                if(response.data.flag){
                    _this.getStuList();
                    _this.$refs.div4.style.display="none";
                }else{
                    alert(response.data.msg);
                }
            });
        },

        saveqj:function(){
            var _this = this;
            axios.post('saveqj.do',_this.stu).then(function (response) {
                if(response.data.flag){
                    _this.getStuList();
                    _this.$refs.div3.style.display="none";
                }else{
                    alert(response.data.msg);
                }
            });
        },
    },

    created:function () {
        this.getStuList();
    },
});