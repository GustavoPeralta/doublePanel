package com.example.grupobecm8.drawer.model;

/**
 * Created by Grupo BECM 8 on 21/02/2017.
 */

public class Post {

    private String title;
    private String subtitle;
    private String body;

    public Post(int num) {
        title = "Lorem Ipsum "+num;
        subtitle = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...";
        body = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce gravida facilisis enim, faucibus elementum tellus dignissim eu. Nullam ullamcorper cursus sapien, quis semper neque. Suspendisse ligula leo, feugiat ac cursus a, dignissim vitae nibh. Sed orci dolor, laoreet at elementum vel, consectetur in purus. Aenean consectetur nisl quis ligula interdum, sed sollicitudin dolor tristique. Sed id tortor risus. Maecenas blandit turpis in fringilla ullamcorper. Integer congue luctus luctus. Ut imperdiet imperdiet lectus, non gravida lorem elementum ut. Quisque vel fermentum risus, nec bibendum lacus. Pellentesque lacinia vulputate tincidunt. Cras posuere dapibus nunc eu sollicitudin. Duis at arcu in lacus interdum facilisis sit amet vel augue. Duis risus tortor, lobortis et velit at, pretium aliquet lectus.\n" +
                "\n" +
                "Proin eu convallis nulla. Pellentesque luctus, nulla eget mattis molestie, nunc diam imperdiet tortor, ac porttitor odio neque eget augue. Morbi dictum leo enim, eget pretium orci finibus id. Vestibulum sed tortor ultrices, mollis purus feugiat, egestas dolor. Aliquam et aliquet nibh, vitae efficitur neque. Quisque semper laoreet mauris non pretium. Duis a turpis volutpat, consectetur turpis id, sagittis sem. Cras tincidunt luctus libero quis porttitor. Etiam sem turpis, euismod imperdiet feugiat id, consequat in dui. Nunc eros nisl, sagittis sed metus blandit, tincidunt elementum ligula. Fusce semper facilisis arcu ut maximus. Praesent posuere lacus in leo euismod tempus. In aliquam magna et nisi accumsan tristique. Fusce tortor lectus, molestie vel vehicula id, cursus a mi. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.\n" +
                "\n" +
                "Mauris enim eros, cursus sit amet faucibus quis, accumsan ullamcorper sem. Nam pulvinar augue mi, ut condimentum turpis pretium consequat. Ut consectetur ex turpis, nec condimentum leo consectetur at. Cras a condimentum velit. Suspendisse potenti. Etiam luctus varius elit, sed bibendum enim volutpat vitae. Vestibulum venenatis, ipsum id egestas fermentum, nisl ex congue magna, sed vehicula tellus risus id eros. Donec at aliquet mi, nec tempus tortor. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nunc auctor tempus est, congue tristique metus lacinia sit amet. Duis ut viverra ante. Vestibulum tincidunt efficitur orci at luctus. Nam laoreet odio libero, ac pharetra nisl gravida vel. Quisque luctus enim eu est laoreet tincidunt quis consectetur ante. Mauris consequat nulla non nibh rhoncus aliquet.\n" +
                "\n" +
                "Donec suscipit nec sapien sit amet posuere. Nullam porta ultrices lacus eget pretium. Phasellus ac pulvinar justo. Integer sit amet nulla iaculis, tincidunt velit sit amet, vestibulum sapien. Vivamus egestas, enim laoreet vestibulum pharetra, dui sem fermentum augue, non iaculis ex nisi a ipsum. Pellentesque eleifend quam sem, vel cursus orci aliquet a. Nulla facilisi. Aliquam vel finibus felis. Duis lacinia quam at mattis fermentum. Vivamus sollicitudin odio vel libero ullamcorper, eget auctor quam hendrerit. In hac habitasse platea dictumst. Quisque ac ipsum justo. Aenean diam orci, imperdiet sit amet placerat vitae, lacinia sed augue. Praesent ut odio nisl.";
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getBody() {
        return body;
    }
}
