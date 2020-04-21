//获取文本文件中的图片链接
function getImgUrl(files, oDiv) {
  for (let i = 0; i < files.length; i++) {
    let file = files[i];

    let reader = new FileReader();
    const filename = file.name;

    //判断文件类型是否为.md
    if (filename.indexOf('.md') > 0) {
      reader.onload = function () {
        if (reader.result) {
          let str = reader.result.toString();

          //正则
          const regExp = /(https?:\/\/.*\.(?:png|jpg|jpeg|gif))/g;

          //使用matchAll来捕获
          let arr = [...str.matchAll(regExp)];

          //完成捕获后遍历获取内容,添加为指定div内的元素
          for (let j = 0; j < arr.length; j++) {
            let oSpan = document.createElement('span');
            let oBr = document.createElement('br');
            oSpan.innerText = arr[j][0];
            oDiv.appendChild(oSpan);
            oDiv.appendChild(oBr)
          }
        }
      };
      reader.readAsText(file);
    }
  }
}
