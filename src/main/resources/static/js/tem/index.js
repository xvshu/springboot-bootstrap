$(function(){
    //菜单点击
    $(".J_menuItem").on('click',function(){
        var url = $(this).attr('href');
        var name = this.text;
        var item = {'id':name,'name':name,'url':url,'closable':true};
        closableTab.addTab(item);
        return false;
    });
});