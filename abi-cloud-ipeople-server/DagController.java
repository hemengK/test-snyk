/**
 * @author JokerDa.
 * @date 2023/2/23 11:09
 * Description:
 */
@RequestMapping("/dag")
@RestController
@Api(value = "DAG审批controller", tags = {"DAG审批接口"})
public class DagController {

    @ApiOperation(value = "Dag上传文件")
    @GetMapping("/uploadFile")
    public String uploadFile(@RequestParam String fileName, @RequestParam String url) {
        return "";
    }

    @ApiOperation(value = "获取Dag文件路径")
    @GetMapping("/getDownloadUrl")
    public String getDownloadUrl(@RequestParam String downloadKey) {
        return "";
    }

}