import devops_module as dev
import sys

new_image = sys.argv[1]
change=dev.update_image(new_image,"deployment.yml")
